package study.data_jpa.dto;

import lombok.*;

@Data
public class MemberDto {

    private Long id;
    private String username;
    private String team;


    public MemberDto(Long id, String username, String team) {
        this.id = id;
        this.username = username;
        this.team = team;
    }


}
