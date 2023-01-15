package com.boirard_tadjer;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {
    private Integer id;
    private String title;
    private Integer releaseDate;
    private String author;
}
