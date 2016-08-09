package ru.atconsulting.bigdata.database.domain.db.user;

//import ru.atconsulting.bigdata.database.domain.db.logs.Log;


import ru.atconsulting.bigdata.database.domain.db.logs.Log;
import ru.atconsulting.bigdata.database.domain.db.steps.StepResults;
import ru.atconsulting.bigdata.database.domain.db.visit.Visits;

import javax.persistence.*;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by NSkovpin on 02.08.2016.
 */
@Entity
@Table(name = "client",uniqueConstraints = @UniqueConstraint(columnNames = "telegramId"))
@NamedQueries({
        @NamedQuery(name = "Client.findAll", query = "SELECT u from Client u"),
        @NamedQuery(name = "Client.findByTelegram", query = "SELECT u FROM Client u WHERE u.telegramId= :telegramId")
})
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long clientId;

    @Column(name = "telegramId", nullable = false)
    private String telegramId;

    private Set<Log> logSet = new HashSet<>();

    private Set<Visits> visitsSet = new HashSet<>();

    private Set<StepResults> stepResultsSet = new HashSet<>();

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(String telegramId) {
        this.telegramId = telegramId;
    }


    @OneToMany(mappedBy = "client")
    @Access(AccessType.PROPERTY)
    public Set<Log> getLogSet() {
        return logSet;
    }

    public void setLogSet(Set<Log> logSet) {
        this.logSet = logSet;
    }

    @OneToMany(mappedBy = "client")
    @Access(AccessType.PROPERTY)
    public Set<Visits> getVisitsSet() {
        return visitsSet;
    }

    public void setVisitsSet(Set<Visits> visitsSet) {
        this.visitsSet = visitsSet;
    }

    @OneToMany(mappedBy = "client")
    @Access(AccessType.PROPERTY)
    public Set<StepResults> getStepResultsSet() {
        return stepResultsSet;
    }

    public void setStepResultsSet(Set<StepResults> stepResultsSet) {
        this.stepResultsSet = stepResultsSet;
    }
}
