package com.b3;

public class Manager extends Employee {
    private Employee assistant ;

    @Override
    public String getDetail() {
        return super.getDetail() + " assistant " + assistant.getDetail();
    }

    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }

    public Employee getAssistant() {
        return assistant;
    }

}
