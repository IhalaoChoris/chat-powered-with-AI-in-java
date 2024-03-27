package me.dio.sdw24.domain.model;

public record Champion(
        Long id,
        String name,
        String role,
        String lore,
        String ImageUrl
) {
    public String generateContextByQuestion(String question){
        return """
        Pergunta: %s
        Nome do Campeão: %s
        Função: %s
        Lore: %s
        """.formatted(question ,this.name, this.role, this.lore);
    }
}
