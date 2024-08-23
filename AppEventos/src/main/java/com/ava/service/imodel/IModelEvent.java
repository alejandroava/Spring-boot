package com.ava.repository.imodel;

import com.ava.model.Event;
import com.ava.repository.crud.Create;
import com.ava.repository.crud.DeleteById;

public interface IModelEvent extends
        Create<Event>,
        DeleteById<Event>,
        com.ava.repository.crud.ReadById<Event>,
        com.ava.repository.crud.ReadAll<Event>,
        com.ava.repository.crud.Update<Event> {
}
