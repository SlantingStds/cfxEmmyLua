// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.korioz.intellij.lua.psi.LuaClassField;
import com.intellij.psi.PsiNameIdentifierOwner;
import com.intellij.psi.StubBasedPsiElement;
import com.korioz.intellij.lua.stubs.LuaDocTableFieldStub;
import com.korioz.intellij.lua.psi.Visibility;
import com.korioz.intellij.lua.search.SearchContext;
import com.korioz.intellij.lua.ty.ITy;

public interface LuaDocTableField extends LuaDocPsiElement, LuaClassField, PsiNameIdentifierOwner, StubBasedPsiElement<LuaDocTableFieldStub> {

  @Nullable
  LuaDocTy getTy();

  @NotNull
  PsiElement getId();

  @NotNull
  ITy guessParentType(@NotNull SearchContext context);

  @NotNull
  Visibility getVisibility();

  int getWorth();

  @NotNull
  PsiElement setName(@NotNull String newName);

  @NotNull
  String getName();

  @Nullable
  PsiElement getNameIdentifier();

  @NotNull
  ITy guessType(@NotNull SearchContext context);

  boolean isDeprecated();

}
