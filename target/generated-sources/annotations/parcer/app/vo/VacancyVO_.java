package parcer.app.vo;

import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(VacancyVO.class)
public abstract class VacancyVO_ {

	public static volatile SingularAttribute<VacancyVO, AreaVO> area;
	public static volatile ListAttribute<VacancyVO, KeySkillVO> key_skills;
	public static volatile SingularAttribute<VacancyVO, Boolean> archived;
	public static volatile ListAttribute<VacancyVO, SpecializationVO> specializations;
	public static volatile SingularAttribute<VacancyVO, String> name;
	public static volatile SingularAttribute<VacancyVO, String> description;
	public static volatile SingularAttribute<VacancyVO, EmployerVO> employer;
	public static volatile SingularAttribute<VacancyVO, String> created_at;
	public static volatile SingularAttribute<VacancyVO, String> id;
	public static volatile SingularAttribute<VacancyVO, SalaryVO> salary;
	public static volatile SingularAttribute<VacancyVO, String> published_at;
	public static volatile SingularAttribute<VacancyVO, UUID> uniqueId;

	public static final String AREA = "area";
	public static final String KEY_SKILLS = "key_skills";
	public static final String ARCHIVED = "archived";
	public static final String SPECIALIZATIONS = "specializations";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";
	public static final String EMPLOYER = "employer";
	public static final String CREATED_AT = "created_at";
	public static final String ID = "id";
	public static final String SALARY = "salary";
	public static final String PUBLISHED_AT = "published_at";
	public static final String UNIQUE_ID = "uniqueId";

}

