package ru.clevertec.patterns.abstract_factory.factories;

public enum RoomFactory {

    BATHROOM {
        @Override
        public ModeFactory getModeFactory() {
            return new BathroomFactory();
        }
    },
    LIVING_ROOM {
        @Override
        public ModeFactory getModeFactory() {
            return new LivingRoomFactory();
        }
    };

    public abstract ModeFactory getModeFactory();
}
