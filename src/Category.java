import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Category {

    String id;

    String cloudId;

    Optional<String> activationId;

    long projectId;

    String name;

    Optional<String> description;

    /**
     * the categoryId of the immediate parent of this Category
     */
    Optional<String> parentCategoryId;

    /**
     * the categoryIds of the first level children of this Category
     */
    Optional<List<String>> orderedChildrenCategoryIdList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return projectId == category.projectId &&
                id.equals(category.id) &&
                cloudId.equals(category.cloudId) &&
                activationId.equals(category.activationId) &&
                name.equals(category.name) &&
                (Objects.equals(description, category.description))  &&
                parentCategoryId.equals(category.parentCategoryId) &&
                orderedChildrenCategoryIdList.equals(category.orderedChildrenCategoryIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cloudId, activationId, projectId, name, description, parentCategoryId, orderedChildrenCategoryIdList);
    }
}
