package io.github.lucianodacunha.myfirstapi.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class User {
    private Long id;
    @NonNull
    private String username;
    @NonNull
    private String password;
}
