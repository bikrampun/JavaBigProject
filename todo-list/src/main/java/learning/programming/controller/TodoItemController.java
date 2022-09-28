package learning.programming.controller;

import learning.programming.model.TodoData;
import learning.programming.model.TodoItem;
import learning.programming.service.TodoItemService;
import learning.programming.util.AttributeNames;
import learning.programming.util.Mappings;
import learning.programming.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Slf4j
@Controller
public class TodoItemController {

    //== fields
    private final TodoItemService todoItemService;

    //== constructor
    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    //== model attributes
    @ModelAttribute
    public TodoData todoData() {
        return todoItemService.getData();
    }

    //== handler methods
    // http://localhost:8080/todo-list/items
    @GetMapping(Mappings.ITEMS)
    //Mappings.ITEMS = "items", which is calling from Mappings class
    public String items() {
        return ViewNames.ITEMS_LIST;
    }

    // http://localhost:8080/todo-list/addItem
    // this url is from getting Mappings.Class
    @GetMapping(Mappings.ADD_ITEM)
    public String addEditItem(Model model) {
        TodoItem todoItem = new TodoItem("","", LocalDate.now());
        model.addAttribute(AttributeNames.TODO_ITEM, todoItem);
        return ViewNames.ADD_ITEM;
    }

    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) TodoItem todoItem) {
        log.info("todoItem from form = {}",todoItem);
        todoItemService.addItem((todoItem));
        return "redirect:/" + Mappings.ITEMS;
    }

    @GetMapping(Mappings.DELETE_ITEM)
    public String deleteItem(@RequestParam int id) {
        log.info("Deleting item with id= {}", id);
        todoItemService.removeItem((id));
        return "redirect:/" + Mappings.ITEMS;
    }
}
