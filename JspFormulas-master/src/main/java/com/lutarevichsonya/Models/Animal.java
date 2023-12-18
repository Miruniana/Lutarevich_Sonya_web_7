package com.lutarevichsonya.Models;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Animal {
    private String name;
    private String type;
    private String fullOwnerName;
    private int age;
}
