package net.wuxianjie;

import java.util.Objects;

public class Pojo {

    public static void main(String[] args) {
        String message = "Hello";
        Double percent = 100D;

        OldWay oldWay = new OldWay(message, percent);
        System.out.println(oldWay.getMessage());

        NewWay newWay = new NewWay(message, percent);
        System.out.println(newWay.message());
    }

    public record NewWay(String message, Double percent) {}

    public static class OldWay {

        private String message;
        private Double percent;

        public OldWay(String message, Double percent) {
            this.message = message;
            this.percent = percent;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Double getPercent() {
            return percent;
        }

        public void setPercent(Double percent) {
            this.percent = percent;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            OldWay oldWay = (OldWay) o;
            return Objects.equals(message, oldWay.message) && Objects.equals(percent, oldWay.percent);
        }

        @Override
        public int hashCode() {
            return Objects.hash(message, percent);
        }

        @Override
        public String toString() {
            return "OldWay{" +
                    "message='" + message + '\'' +
                    ", percent=" + percent +
                    '}';
        }
    }
}
