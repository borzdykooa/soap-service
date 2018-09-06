package com.borzdykooa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Класс, представдяющий собой сущность, необходимую для тестирования
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "trainer")
public class Trainer implements Serializable {

    private Long id;
    private String name;
    private String language;
    private Integer experience;
}
