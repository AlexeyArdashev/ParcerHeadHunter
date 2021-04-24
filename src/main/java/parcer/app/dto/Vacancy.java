package parcer.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;
import parcer.app.vo.KeySkillVO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vacancy {

    /**
     * Идентификатор вакансии
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("area")
    private Area area;

    private UUID uniqueId;
    /**
     * Описание вакансии
     */
    @JsonProperty("description")
    public String description;
    /**
     * Информация о ключевых навыках, заявленных в вакансии. Список может быть пустым.
     */
    @Nullable
  //  @JsonProperty("key_skills")
  //  private ArrayList<KeySkill> key_skills;
  //  @JsonProperty("experience")
  //  private Experiens experience;
    @JsonProperty("specializations")
    private ArrayList<Specialization> specializations;
    @Nullable
    @JsonProperty("employer")
    private Employer employer;
    @Nullable
    @JsonProperty("salary")
    private Salary salary;

    /**
     * Дата и время создания вакансии
     */

    @JsonProperty("created_at")
    private String created_at; //
    /**
     * Дата и время публикации вакансии
     */
    @JsonProperty("published_at")
    private String published_at;
    /**
     * Название вакансии
     */
    @JsonProperty("name")
    private String name;
    /**
     * Находится ли данная вакансия в архиве
     */
    @JsonProperty("archived")
    private Boolean archived;

}
