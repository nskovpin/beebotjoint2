package ru.atconsulting.bigdata.database.domain.db.steps;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by NSkovpin on 21.06.2016.
 * Database table with name "step"
 */
@Entity
@Table(name = "step"
        , uniqueConstraints = {
        @UniqueConstraint(columnNames = "telegramId"),
        @UniqueConstraint(columnNames = "ctn")
//        @UniqueConstraint(columnNames = "flow")
}
)
@NamedQueries({
        @NamedQuery(name = "CurrentStep.findByTelegramIdAndCtnAndFlow", query = "SELECT c FROM CurrentStep c " +
                "WHERE c.telegramId = :telegramId AND c.ctn = :ctn AND c.flow = :flow"),

        @NamedQuery(name = "CurrentStep.findAll", query = "SELECT c from CurrentStep c"),

        @NamedQuery(name = "CurrentStep.findByTelegramIdAndCtn", query = "SELECT c FROM CurrentStep c " +
                "WHERE c.telegramId = :telegramId AND c.ctn = :ctn"),
        @NamedQuery(name = "CurrentStep.findByTelegramId", query = "SELECT c FROM CurrentStep c " +
                "WHERE c.telegramId = :telegramId")

})
public class CurrentStep {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "telegramId", nullable = false)
    private String telegramId;

    @Column(name = "currentStep")
    private String currentStep;

    @Column(name = "ctn")
    private String ctn;

    @Column(name = "flow")
    private String flow;

    @Column(name = "future_flow")
    private String futureFlow;

    private Set<StepResults> stepResultsList = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(String currentStep) {
        this.currentStep = currentStep;
    }

    public String getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(String telegramId) {
        this.telegramId = telegramId;
    }

    public String getCtn() {
        return ctn;
    }

    public void setCtn(String ctn) {
        this.ctn = ctn;
    }

    @OneToMany(mappedBy = "curStep")
    @Access(AccessType.PROPERTY)
    public Set<StepResults> getStepResultsList(){
        return this.stepResultsList;
    }

    public void setStepResultsList(Set<StepResults> stepResultsList){
        this.stepResultsList = stepResultsList;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public String getFutureFlow() {
        return futureFlow;
    }

    public void setFutureFlow(String futureFlow) {
        this.futureFlow = futureFlow;
    }
}
