package learning.programming.util;

//this class will actually hold constants for all the mappings in our application
public final class Mappings {

    //== constants, it represents the mapping name
    public static final String ITEMS = "items";
    public static final String ADD_ITEM = "addItem";
    public static final String DELETE_ITEM = "deleteItem";
    public static final String VIEW_ITEM = "viewItem";
    //final class and private constructor
    //since class will only contain public static constants that we can use directly
    //final class to ensure class can't be extended
    //private constructor since there should be no reason to instantiate it
    private Mappings() {}

}
