package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.entity.BaseEntity;

import java.util.UUID;

public class TrackingId extends BaseEntity<UUID> {
    public TrackingId(UUID id) {
        super.setId(id);
    }
}
