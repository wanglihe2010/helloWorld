package com.example.model;

import java.util.Objects;

public class Widget {

    double width;
    double length;
    double height;

    public Widget() {
    }

    public Widget(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Widget widget = (Widget) o;
        return Double.compare(widget.width, width) == 0 &&
                Double.compare(widget.length, length) == 0 &&
                Double.compare(widget.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Widget{");
        sb.append("width=").append(width);
        sb.append(", length=").append(length);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
