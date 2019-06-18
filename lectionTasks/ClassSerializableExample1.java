package kz.epam.gabdollin.practice.lectionTasks;

import java.io.Serializable;

public class ClassSerializableExample1 implements Serializable  {


            private double x;
            private double y;

            public ClassSerializableExample1(double x, double y) {
                this.x = x;
                this.y = y;
            }

            public String toString() {
                return "(" + x + "," + y + ") reference=" + super.toString();
            }
}
