package me.dio.sdw24.domain.ports;

public interface GenerativeAIApi {

    String generateContent(String objective, String context);
}
