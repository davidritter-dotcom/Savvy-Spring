package ch.ffhs.savvy_spring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiaryEntry {

    private Long entryId;

    private String title;

    private String content;

    private String user_id;
}
