package ir.maktabcw19;


import ir.maktabcw19.config.ApplicationContext;
import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
      EntityManager em = ApplicationContext.getInstance().getEntityManager();

    }
}