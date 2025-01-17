package com.bloodglucose.api.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodglucose.api.core.entity.GlucoseEntity;

import java.util.Date;
import java.util.List;

public interface GlucoseRepositoryAdapterOut extends JpaRepository<GlucoseEntity, Long> {

    /**
     * @See https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
     */

    /**
     * Assinatura do metodo que usara o spring data para buscar pela refeicao. <br>
     * Esse metodo ira gerar automaticamente uma namedquery mais ou menos assim: <br>
     * <code>@NamedQuery(name="Glucose.findByMeal", query="SELECT g FROM Glucose g WHERE g.meal = ?")</code>
     * @param meal
     * @return
     */
    List<GlucoseEntity> findByMeal(String meal);

    /**
     * Assinatura do metodo que usara o spring data para buscar por data. <br>
     * Esse metodo ira gerar automaticamente uma namedquery mais ou menos assim: <br>
     *  <code>@NamedQuery(name="Glucose.findByDate", query="SELECT g FROM Glucose g WHERE g.date = ?")</code>
     * @param date
     * @return
     */
    List<GlucoseEntity> findByDate(Date date);

    /**
     * Assinatura do metodo que usara o spring data para buscar por intervalo de datas. <br>
     * Esse metodo ira gerar automaticamente uma namedquery mais ou menos assim: <br>
     *  <code>@NamedQuery(name="Glucose.findByDateBetween", query="SELECT g FROM Glucose g WHERE g.date between ?1 and ?2")</code>
     * @param startDate
     * @param endDate
     * @return
     */
    List<GlucoseEntity> findByDateBetween(Date startDate, Date endDate);

    /**
     * Assinatura do metodo que usara o spring data para buscar por uma data e refeicao.
     * Esse metodo ira gerar automaticamente uma namedquery mais ou menos assim: <br>
     *  <code>@NamedQuery(name="Glucose.findByDateAndMeal", query="SELECT g FROM Glucose g WHERE g.date = ?1 and g.meal = ?2")
     * @param date
     * @param meal
     * @return
     */
    List<GlucoseEntity> findByDateAndMeal(Date date, String meal);

    /**
     * Assinatura do metodo que usara o spring data para buscar por intervalo de datas e refeicao.
     * Esse metodo ira gerar automaticamente uma namedquery mais ou menos assim: <br>
     *      *  <code>@NamedQuery(name="Glucose.findByDateBetweenAndMeal", query="SELECT g FROM Glucose g WHERE g.date between ?1 and ?2
     *      and g.meal = ?3")
     * @param startDate
     * @param endDate
     * @param meal
     * @return
     */
    List<GlucoseEntity> findByDateBetweenAndMeal(Date startDate, Date endDate, String meal);
}


