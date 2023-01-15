package com.boirard_tadjer;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Actor {
    private Integer id;
    private String name;
    private Integer birthYear;
    private Integer idMovie;
}
