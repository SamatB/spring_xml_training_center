package com.training.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig — это конфигурационный класс Spring, который заменяет XML.
 */
@Configuration //@Component
@ComponentScan("com.training")
public class AppConfig {

    /**
     * @ComponentScan("org.example")
     * Означает:
     * Spring будет сканировать пакет org.example и искать:
     * - @Component
     * - @Service
     * - @Repository
     * - @Controller
     *
     * Что делает:
     * - находит классы,
     * - создает Beans,
     * - кладет их в контейнер.
     *
     * Что происходит при запуске:
     * Spring:
     * 1. загружает AppConfig
     * 2. видит @ComponentScan
     * 3. сканирует org.example
     * 4. находит все компоненты
     * 5. создает Beans
     * 6. связывает зависимости
     *
     * Без AppConfig:
     * Аннотации не заработают
     * Spring не будет знать:
     * - где искать классы,
     * - что нужно создать.
     *
     * Итог:
     * AppConfig — это класс, который говорит Spring:
     * “Сканируй этот пакет, найди компоненты и создай их”
     */
}
