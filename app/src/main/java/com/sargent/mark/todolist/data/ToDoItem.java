package com.sargent.mark.todolist.data;

/**
 * Created by mark on 7/4/17.
 */

// added a new variable to the ToDoItem model to get a checkbox

public class ToDoItem {
    private String description;
    private String dueDate;
    private boolean checkbox;

    public ToDoItem(String description, String dueDate) {
        this.description = description;
        this.dueDate = dueDate;
        checkbox = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }
}
