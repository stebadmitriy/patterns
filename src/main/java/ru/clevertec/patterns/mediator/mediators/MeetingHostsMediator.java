package ru.clevertec.patterns.mediator.mediators;

import ru.clevertec.patterns.mediator.components.Communicable;

public class MeetingHostsMediator implements Mediator{
    /** В данном медиаторе мы можем использовать прежние и дополнительные девайсы
     * для обеспечния нового сценария умного дома "Встреча хозяев"*/

    @Override
    public void registerComponent(Communicable device) {

    }

    @Override
    public void applyNextStep(Communicable communicable) {

    }

    @Override
    public void sendNotification() {

    }
}
