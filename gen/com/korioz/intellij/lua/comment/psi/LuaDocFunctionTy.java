// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.korioz.intellij.lua.ty.ITy;

public interface LuaDocFunctionTy extends LuaDocTy {

  @NotNull
  List<LuaDocFunctionParam> getFunctionParamList();

  @NotNull
  List<LuaDocGenericDef> getGenericDefList();

  @Nullable
  LuaDocTypeList getTypeList();

  @Nullable
  LuaDocVarargParam getVarargParam();

  @NotNull
  ITy getType();

  @NotNull
  ITy getReturnType();

}
