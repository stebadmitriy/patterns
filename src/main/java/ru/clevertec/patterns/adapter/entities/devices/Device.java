package ru.clevertec.patterns.adapter.entities.devices;

import ru.clevertec.patterns.adapter.entities.protocols.Protocol;

public interface Device {
    Protocol getProtocol();
}
