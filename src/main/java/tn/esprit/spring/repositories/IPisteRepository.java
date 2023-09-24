package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Color;
import tn.esprit.spring.entities.Piste;

import java.util.List;

public interface IPisteRepository extends JpaRepository<Piste, Long> {

    List<Piste> findByColor(Color color);

    @Query("SELECT p FROM Piste  p where p.color = ?1 and p.length = ?2")
    List<Piste> m1(int p, Color color);
    @Query("SELECT p FROM Piste  p where p.color = :c and p.length = :p")
    List<Piste> m2(@Param("p") int p, @Param("c") Color color);
}
