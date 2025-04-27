package ir.maktabcw19;
import ir.maktabcw19.config.ApplicationContext;
import ir.maktabcw19.entity.Lesson;
import jakarta.persistence.EntityManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
      EntityManager em = ApplicationContext.getInstance().getEntityManager();

    }
}