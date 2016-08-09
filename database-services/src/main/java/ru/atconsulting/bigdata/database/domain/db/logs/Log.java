package ru.atconsulting.bigdata.database.domain.db.logs;

import org.hibernate.annotations.*;
import org.joda.time.DateTime;
import ru.atconsulting.bigdata.database.domain.db.steps.CurrentStep;
import ru.atconsulting.bigdata.database.domain.db.user.Client;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Created by NSkovpin on 02.08.2016.
 */
@Table(name = "logs")
@Entity
@NamedQueries({
        @NamedQuery(name = "Log.findAll", query = "SELECT l from Log l"),
        @NamedQuery(name = "Log.findByTelegram", query = "SELECT l FROM Log l WHERE l.client.telegramId= :telegramId"),
        @NamedQuery(name = "Log.findByTelegramAndAdditionalLike", query = "SELECT l FROM Log l " +
                "WHERE l.client.telegramId= :telegramId AND l.additional like :additional"),
})
public class Log {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long logId;

    @ManyToOne()
    @JoinColumn(name = "clientId")
    private Client client;

    @Column
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime date;

    @Column
    private String text;

    @Column
    private String additional;

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
