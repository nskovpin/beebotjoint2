package ru.atconsulting.bigdata.database.domain.db.steps;

import org.hibernate.annotations.*;
import org.joda.time.DateTime;
import ru.atconsulting.bigdata.database.domain.answer.Answer;
import ru.atconsulting.bigdata.database.domain.answer.StepAnswerType;
import ru.atconsulting.bigdata.database.domain.db.user.Client;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Created by NSkovpin on 22.06.2016.
 * Database table with name "stepResults"
 */
@Entity
@Table(name = "results")
@TypeDefs({
        @TypeDef(name = StepAnswerType.NAME, typeClass = StepAnswerType.class)
})
@NamedQueries({
        @NamedQuery(name = "StepResults.findAll", query = "SELECT s FROM StepResults s"),
        @NamedQuery(name = "StepResults.findByCurrentStep", query = "SELECT s FROM StepResults s WHERE s.curStep.id = :curStepId"),
        @NamedQuery(name = "StepResults.findByTelegramId", query = "SELECT s FROM StepResults s WHERE s.client.telegramId = :telegramId")
})
public class StepResults {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "step")
    private String step;

    @Column(name = "result")
    @Type(type = StepAnswerType.NAME)
    private Answer result;

    @ManyToOne()
    @JoinColumn(name = "curStep")
    private CurrentStep curStep;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Client client;

    @Column
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public Answer getResult() {
        return result;
    }

    public void setResult(Answer result) {
        this.result = result;
    }

    public CurrentStep getCurrentStep() {
        return curStep;
    }

    public void setCurrentStep(CurrentStep currentStep) {
        this.curStep = currentStep;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }
}
