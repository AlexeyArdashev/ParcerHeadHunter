package parcer.app.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import parcer.app.dto.KeySkill;
import parcer.app.dto.Specialization;
import parcer.app.dto.Vacancy;
import parcer.app.vo.KeySkillVO;
import parcer.app.vo.SpecializationVO;
import parcer.app.vo.VacancyVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-04T15:35:14+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.10 (Ubuntu)"
)
@Component
public class VacancyMappersImpl extends VacancyMappers {

    @Autowired
    private AreaMappers areaMappers;
    @Autowired
    private KeySkillMappers keySkillMappers;
    @Autowired
    private SpecializationMappers specializationMappers;
    @Autowired
    private SalaryMappers salaryMappers;
    @Autowired
    private EmployerMappers employerMappers;

    @Override
    public Vacancy toDto(VacancyVO vo) {
        if ( vo == null ) {
            return null;
        }

        Vacancy vacancy = new Vacancy();

        vacancy.setId( vo.getId() );
        vacancy.setArea( areaMappers.toDto( vo.getArea() ) );
        vacancy.setUniqueId( vo.getUniqueId() );
        vacancy.setDescription( vo.getDescription() );
        vacancy.setKey_skills( keySkillVOListToKeySkillArrayList( vo.getKey_skills() ) );
        vacancy.setSpecializations( specializationVOListToSpecializationArrayList( vo.getSpecializations() ) );
        vacancy.setEmployer( employerMappers.toDto( vo.getEmployer() ) );
        vacancy.setSalary( salaryMappers.toDto( vo.getSalary() ) );
        vacancy.setCreated_at( vo.getCreated_at() );
        vacancy.setPublished_at( vo.getPublished_at() );
        vacancy.setName( vo.getName() );
        vacancy.setArchived( vo.getArchived() );

        return vacancy;
    }

    @Override
    public VacancyVO toVO(Vacancy dto) {
        if ( dto == null ) {
            return null;
        }

        VacancyVO vacancyVO = new VacancyVO();

        vacancyVO.setUniqueId( dto.getUniqueId() );
        vacancyVO.setId( dto.getId() );
        vacancyVO.setArea( areaMappers.toVO( dto.getArea() ) );
        vacancyVO.setDescription( dto.getDescription() );
        vacancyVO.setKey_skills( keySkillArrayListToKeySkillVOList( dto.getKey_skills() ) );
        vacancyVO.setSpecializations( specializationArrayListToSpecializationVOList( dto.getSpecializations() ) );
        vacancyVO.setEmployer( employerMappers.toVO( dto.getEmployer() ) );
        vacancyVO.setSalary( salaryMappers.toVO( dto.getSalary() ) );
        vacancyVO.setCreated_at( dto.getCreated_at() );
        vacancyVO.setPublished_at( dto.getPublished_at() );
        vacancyVO.setName( dto.getName() );
        vacancyVO.setArchived( dto.getArchived() );

        return vacancyVO;
    }

    protected ArrayList<KeySkill> keySkillVOListToKeySkillArrayList(List<KeySkillVO> list) {
        if ( list == null ) {
            return null;
        }

        ArrayList<KeySkill> arrayList = new ArrayList<KeySkill>();
        for ( KeySkillVO keySkillVO : list ) {
            arrayList.add( keySkillMappers.toDto( keySkillVO ) );
        }

        return arrayList;
    }

    protected ArrayList<Specialization> specializationVOListToSpecializationArrayList(List<SpecializationVO> list) {
        if ( list == null ) {
            return null;
        }

        ArrayList<Specialization> arrayList = new ArrayList<Specialization>();
        for ( SpecializationVO specializationVO : list ) {
            arrayList.add( specializationMappers.toDto( specializationVO ) );
        }

        return arrayList;
    }

    protected List<KeySkillVO> keySkillArrayListToKeySkillVOList(ArrayList<KeySkill> arrayList) {
        if ( arrayList == null ) {
            return null;
        }

        List<KeySkillVO> list = new ArrayList<KeySkillVO>( arrayList.size() );
        for ( KeySkill keySkill : arrayList ) {
            list.add( keySkillMappers.toVO( keySkill ) );
        }

        return list;
    }

    protected List<SpecializationVO> specializationArrayListToSpecializationVOList(ArrayList<Specialization> arrayList) {
        if ( arrayList == null ) {
            return null;
        }

        List<SpecializationVO> list = new ArrayList<SpecializationVO>( arrayList.size() );
        for ( Specialization specialization : arrayList ) {
            list.add( specializationMappers.toVO( specialization ) );
        }

        return list;
    }
}
