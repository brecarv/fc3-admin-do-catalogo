package com.fullcycle.admin.catalogo.application.category.delete;

import com.fullcycle.admin.catalogo.domain.category.CategoryGateway;
import com.fullcycle.admin.catalogo.domain.category.CategoryID;

import java.util.Objects;

public class DefaultDeleteCategoryUseCase
    extends DeleteCategoryUseCase {

  private  final CategoryGateway categoryGateway;

  public DefaultDeleteCategoryUseCase(CategoryGateway categoryGateway) {
    this.categoryGateway = Objects.requireNonNull(categoryGateway);
  }

  @Override
  public void execute(String anIn) {
  this.categoryGateway.deleteById(CategoryID.from(anIn));
  }
}
