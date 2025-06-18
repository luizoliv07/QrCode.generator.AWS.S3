package com.luizoliveiradev.qrcode.generator.ports;

public interface StoragePort {
    String upload(byte[] file, String fileName, String contentType);
}

