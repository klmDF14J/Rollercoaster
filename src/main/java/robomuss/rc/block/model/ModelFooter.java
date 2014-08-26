// Date: 26/08/2014 17:45:10
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package robomuss.rc.block.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFooter extends ModelBase
{
  //fields
    public ModelRenderer footer;
    public ModelRenderer middle;
    public ModelRenderer middle2;
  
  public ModelFooter()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      footer = new ModelRenderer(this, 0, 0);
      footer.addBox(0F, 0F, 0F, 14, 5, 14);
      footer.setRotationPoint(-7F, 19F, -7F);
      footer.setTextureSize(64, 32);
      footer.mirror = true;
      setRotation(footer, 0F, 0F, 0F);
      middle = new ModelRenderer(this, 0, 19);
      middle.addBox(0F, 0F, 0F, 8, 11, 8);
      middle.setRotationPoint(-4F, 8F, -4F);
      middle.setTextureSize(64, 32);
      middle.mirror = true;
      setRotation(middle, 0F, 0F, 0F);
      middle2 = new ModelRenderer(this, 0, 19);
      middle2.addBox(0F, 0F, 0F, 8, 11, 8);
      middle2.setRotationPoint(-6F, 8F, 0F);
      middle2.setTextureSize(64, 32);
      middle2.mirror = true;
      setRotation(middle2, 0F, 0.7853982F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    footer.render(f5);
    middle.render(f5);
    middle2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
