package dev.arganaphangquestian.data;

import lombok.Data;

public @Data class Todo {
    private int id;
    private String title;
    private boolean isDone;
}
