package ru.beeline.bigdata.flowmanager.workflow;

import ru.atconsulting.bigdata.database.domain.db.user.Client;
import ru.beeline.bigdata.flowmanager.workflow.json.technical.Flow;

/**
 * Created by NSkovpin on 05.08.2016.
 */
public class ClientTelegramCtnFlow {

    private Client client;

    private String telegramId;

    private String ctn;

    private Flow flow;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public Flow getFlow() {
        return flow;
    }

    public void setFlow(Flow flow) {
        this.flow = flow;
    }
}
