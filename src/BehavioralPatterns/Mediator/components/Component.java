package BehavioralPatterns.Mediator.components;

import BehavioralPatterns.Mediator.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}
