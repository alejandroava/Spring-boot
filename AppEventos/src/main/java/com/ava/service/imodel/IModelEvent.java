package com.ava.repository.imodel;

import com.ava.model.Event;
import com.ava.repository.crud.Create;
import com.ava.repository.crud.DeleteById;

public interface IModelEvent extends Create<Event>,
        DeleteById<Event>

        {
}
