// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.korioz.intellij.lua.stubs.LuaDocTableDefStub;

public interface LuaDocTableDef extends LuaDocPsiElement, StubBasedPsiElement<LuaDocTableDefStub> {

  @NotNull
  List<LuaDocTableField> getTableFieldList();

}
