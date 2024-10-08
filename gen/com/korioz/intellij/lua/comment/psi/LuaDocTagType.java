// This is a generated file. Not intended for manual editing.
package com.korioz.intellij.lua.comment.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.korioz.intellij.lua.stubs.LuaDocTagTypeStub;
import com.korioz.intellij.lua.ty.ITy;

public interface LuaDocTagType extends LuaDocTag, StubBasedPsiElement<LuaDocTagTypeStub> {

  @Nullable
  LuaDocCommentString getCommentString();

  @Nullable
  LuaDocTy getTy();

  @NotNull
  ITy getType();

}
