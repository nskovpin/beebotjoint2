package ru.atconsulting.bigdata.database.domain.db.visit;

import org.hibernate.annotations.*;

import org.joda.time.DateTime;
import ru.atconsulting.bigdata.database.domain.db.user.Client;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Created by NSkovpin on 12.07.2016.
 * Database table with name "visits"
 */
@Entity
@Table(name = "visits")
@NamedQueries({
        @NamedQuery(name = "Visits.findAll", query = "SELECT c from Visits c"),
        @NamedQuery(name = "Visits.findByTelegram", query = "SELECT c FROM Visits c WHERE c.client.telegramId= :telegramId")

})
public class Visits {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long visitId;

    @ManyToOne()
    @JoinColumn(name = "clientId")
    private Client client;

    @Column
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime date;

    @Column
    private Long count;

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
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

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
