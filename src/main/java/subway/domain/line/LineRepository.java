package subway.domain.line;

import java.util.List;
import subway.domain.line.dto.LineWithSectionRes;

public interface LineRepository {

    Long insert(final Line line);

    List<LineWithSectionRes> findWithSectionsByLineId(final Long id);

    List<LineWithSectionRes> findAllWithSections();

    void updateById(final Long id, final Line line);

    void deleteById(final Long id);

    Line findById(final Long id);

    boolean existByName(final String name);
}
