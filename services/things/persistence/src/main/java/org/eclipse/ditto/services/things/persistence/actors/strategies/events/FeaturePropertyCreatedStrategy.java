/*
 * Copyright (c) 2017 Bosch Software Innovations GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/index.php
 * Contributors:
 *    Bosch Software Innovations GmbH - initial contribution
 *
 */
package org.eclipse.ditto.services.things.persistence.actors.strategies.events;

import javax.annotation.concurrent.Immutable;

import org.eclipse.ditto.model.things.ThingBuilder;
import org.eclipse.ditto.signals.events.things.FeaturePropertyCreated;

/**
 * This strategy handles the {@link org.eclipse.ditto.signals.events.things.FeaturePropertyCreated} event.
 */
@Immutable
final class FeaturePropertyCreatedStrategy extends AbstractEventStrategy<FeaturePropertyCreated> {

    @Override
    protected ThingBuilder.FromCopy applyEvent(final FeaturePropertyCreated event,
            final ThingBuilder.FromCopy thingBuilder) {

        return thingBuilder.setFeatureProperty(event.getFeatureId(), event.getPropertyPointer(),
                event.getPropertyValue());
    }

}
