package parcer.app.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Embeddable;

@Getter @Setter
@Embeddable
public class SalaryVO {

    @Nullable
    Integer from;

    @Nullable
    Integer to;

    @Nullable
    Boolean gross;
}
