package ru.atconsulting.bigdata.database.domain.answer;

import java.io.Serializable;

/**
 * Created by NSkovpin on 23.06.2016.
 */
public interface Answer extends Serializable{

    static final long serialVersionUID = 1L;

    String getAction();

    String getTelegramId();
}
