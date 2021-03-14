package parcer.app.vo;

import org.springframework.lang.Nullable;

import javax.persistence.Embeddable;


@Embeddable
public class SalaryVO {

    @Nullable
    Integer from;

    @Nullable
    Integer to;

    @Nullable
    Boolean gross;
}
