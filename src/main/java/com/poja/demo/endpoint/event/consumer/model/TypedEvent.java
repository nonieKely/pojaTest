package com.poja.demo.endpoint.event.consumer.model;

import com.poja.demo.PojaGenerated;
import com.poja.demo.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
