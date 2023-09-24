package tn.esprit.spring.configs;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
//@Component
public class SupervisionAspect {

    @Around("@annotation(supervision)")
    public Object superviser(ProceedingJoinPoint joinPoint, Supervision supervision)
            throws Throwable {
        long maxDuree = supervision.dureeMillis();
        long start = System.currentTimeMillis();
        try {
            return joinPoint.proceed(joinPoint.getArgs());
        } finally {
            long end = System.currentTimeMillis();
            long duree = end - start;
            if (duree > maxDuree) {
                System.out.printf("Attention l'appel à %s à durée %dms soit %dms de plus qu'attendu%n",
                        joinPoint.toShortString(), duree, duree - maxDuree);
            }
        }
    }

}
