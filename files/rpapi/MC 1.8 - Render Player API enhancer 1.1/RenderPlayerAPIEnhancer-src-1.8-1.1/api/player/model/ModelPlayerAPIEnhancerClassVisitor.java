package api.player.model;

import java.io.*;
import java.util.*;

import org.objectweb.asm.*;
import org.apache.logging.log4j.*;

public class ModelPlayerAPIEnhancerClassVisitor extends ClassVisitor
{
	public static byte[] transform(byte[] bytes, boolean isObfuscated)
	{
		try
		{
			ByteArrayInputStream in = new ByteArrayInputStream(bytes);
			ClassReader cr = new ClassReader(in);
			ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
			ModelPlayerAPIEnhancerClassVisitor p = new ModelPlayerAPIEnhancerClassVisitor(cw, isObfuscated, bytes);

			cr.accept(p, 0);

			byte[] result = bytes;
			if (p.enhancableClassName != null)
				result = cw.toByteArray();

			in.close();
			return result;
		}
		catch(IOException ioe)
		{
			throw new RuntimeException(ioe);
		}
	}

	public ModelPlayerAPIEnhancerClassVisitor(ClassVisitor classVisitor, boolean isObfuscated, byte[] bytes)
	{
		super(262144, classVisitor);
		this.isObfuscated = isObfuscated;
		this.bytes = bytes;
	}

	private final boolean isObfuscated;
	private String enhancableClassName;
	private final byte[] bytes;
	private Set<String> superCallingMethods;
	private String originalSuperClassName;
	private String enhancerSuperClassName;

	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces)
	{
		if((isObfuscated && superName.equals("ccl")) || superName.equals("net/minecraft/client/model/ModelBiped"))
		{
			enhancableClassName = name.replace('/', '.');
			originalSuperClassName = superName;
			enhancerSuperClassName = superName = superName.equals("ccl") ? "api/player/model/ModelPlayerArmor" : "api/player/model/ModelPlayerArmor";
			info("enhances class '%s' to extend class '%s' instead of class '%s'", enhancableClassName, enhancerSuperClassName.replace('/', '.'), originalSuperClassName.replace('/', '.'));
			superCallingMethods = ModelPlayerAPIEnhancerClassScanner.scan(bytes);
		}
		else
			info("leaves class '%s' untouched because it extends the unrelated class '%s'", name.replace('/', '.'), superName.replace('/', '.'));

		super.visit(version, access, name, signature, superName, interfaces);
	}

	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions)
	{
		if(enhancableClassName != null && !name.equals("<cinit>") && !name.equals("<clinit>"))
		{
			if(name.equals("<init>"))
			{
				info("modifies constructor '%s%s'", enhancableClassName, desc);
				return new ModelPlayerAPIEnhancerConstructorVisitor(super.visitMethod(access, name, desc, signature, exceptions), isObfuscated);
			}
			else if((access & Opcodes.ACC_STATIC) == 0)
			{
				return new ModelPlayerAPIEnhancerMethodVisitor(super.visitMethod(access, getMethodName(name, desc), desc, signature, exceptions), isObfuscated, enhancableClassName, originalSuperClassName, enhancerSuperClassName, superCallingMethods, name, desc);
			}
		}
		return super.visitMethod(access, name, desc, signature, exceptions);
	}

	private String getMethodName(String name, String desc)
	{
		if(isObfuscated)
		{
			if(name.equals("a") && desc.equals("(Ljava/util/Random;)Lcdy;"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method ", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localGetRandomModelBox' because it actually is 'getRandomModelBox' and doesn't call its super method", enhancableClassName, name, desc);
					return "localGetRandomModelBox";
				}
			}
			else if(name.equals("func_85181_a") && desc.equals("(Ljava/util/Random;)Lnet/minecraft/client/model/ModelRenderer;"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localGetRandomModelBox' because it actually is 'getRandomModelBox' and doesn't call its super method", enhancableClassName, name, desc);
					return "localGetRandomModelBox";
				}
			}
		}
		else if(name.equals("getRandomModelBox") && desc.equals("(Ljava/util/Random;)Lnet/minecraft/client/model/ModelRenderer;"))
		{
			if(superCallingMethods.contains(name + "___" + desc))
			{
				info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
				return name;
			}
			else
			{
				info("renames method '%s.%s%s' to 'localGetRandomModelBox' because it doesn't call its super method", enhancableClassName, name, desc);
				return "localGetRandomModelBox";
			}
		}

		if(isObfuscated)
		{
			if(name.equals("a") && desc.equals("(Ljava/lang/String;)Lcdz;"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method ", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localGetTextureOffset' because it actually is 'getTextureOffset' and doesn't call its super method", enhancableClassName, name, desc);
					return "localGetTextureOffset";
				}
			}
			else if(name.equals("func_78084_a") && desc.equals("(Ljava/lang/String;)Lnet/minecraft/client/model/TextureOffset;"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localGetTextureOffset' because it actually is 'getTextureOffset' and doesn't call its super method", enhancableClassName, name, desc);
					return "localGetTextureOffset";
				}
			}
		}
		else if(name.equals("getTextureOffset") && desc.equals("(Ljava/lang/String;)Lnet/minecraft/client/model/TextureOffset;"))
		{
			if(superCallingMethods.contains(name + "___" + desc))
			{
				info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
				return name;
			}
			else
			{
				info("renames method '%s.%s%s' to 'localGetTextureOffset' because it doesn't call its super method", enhancableClassName, name, desc);
				return "localGetTextureOffset";
			}
		}

		if(isObfuscated)
		{
			if(name.equals("a") && desc.equals("(F)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method ", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localPostRenderArm' because it actually is 'postRenderArm' and doesn't call its super method", enhancableClassName, name, desc);
					return "localPostRenderArm";
				}
			}
			else if(name.equals("func_178718_a") && desc.equals("(F)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localPostRenderArm' because it actually is 'postRenderArm' and doesn't call its super method", enhancableClassName, name, desc);
					return "localPostRenderArm";
				}
			}
		}
		else if(name.equals("postRenderArm") && desc.equals("(F)V"))
		{
			if(superCallingMethods.contains(name + "___" + desc))
			{
				info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
				return name;
			}
			else
			{
				info("renames method '%s.%s%s' to 'localPostRenderArm' because it doesn't call its super method", enhancableClassName, name, desc);
				return "localPostRenderArm";
			}
		}

		if(isObfuscated)
		{
			if(name.equals("a") && desc.equals("(Lwv;FFFFFF)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method ", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localRender' because it actually is 'render' and doesn't call its super method", enhancableClassName, name, desc);
					return "localRender";
				}
			}
			else if(name.equals("func_78088_a") && desc.equals("(Lnet/minecraft/entity/Entity;FFFFFF)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localRender' because it actually is 'render' and doesn't call its super method", enhancableClassName, name, desc);
					return "localRender";
				}
			}
		}
		else if(name.equals("render") && desc.equals("(Lnet/minecraft/entity/Entity;FFFFFF)V"))
		{
			if(superCallingMethods.contains(name + "___" + desc))
			{
				info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
				return name;
			}
			else
			{
				info("renames method '%s.%s%s' to 'localRender' because it doesn't call its super method", enhancableClassName, name, desc);
				return "localRender";
			}
		}

		if(isObfuscated)
		{
			if(name.equals("a") && desc.equals("(Z)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method ", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localSetInvisible' because it actually is 'setInvisible' and doesn't call its super method", enhancableClassName, name, desc);
					return "localSetInvisible";
				}
			}
			else if(name.equals("func_178719_a") && desc.equals("(Z)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localSetInvisible' because it actually is 'setInvisible' and doesn't call its super method", enhancableClassName, name, desc);
					return "localSetInvisible";
				}
			}
		}
		else if(name.equals("setInvisible") && desc.equals("(Z)V"))
		{
			if(superCallingMethods.contains(name + "___" + desc))
			{
				info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
				return name;
			}
			else
			{
				info("renames method '%s.%s%s' to 'localSetInvisible' because it doesn't call its super method", enhancableClassName, name, desc);
				return "localSetInvisible";
			}
		}

		if(isObfuscated)
		{
			if(name.equals("a") && desc.equals("(Lxm;FFF)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method ", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localSetLivingAnimations' because it actually is 'setLivingAnimations' and doesn't call its super method", enhancableClassName, name, desc);
					return "localSetLivingAnimations";
				}
			}
			else if(name.equals("func_78086_a") && desc.equals("(Lnet/minecraft/entity/EntityLivingBase;FFF)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localSetLivingAnimations' because it actually is 'setLivingAnimations' and doesn't call its super method", enhancableClassName, name, desc);
					return "localSetLivingAnimations";
				}
			}
		}
		else if(name.equals("setLivingAnimations") && desc.equals("(Lnet/minecraft/entity/EntityLivingBase;FFF)V"))
		{
			if(superCallingMethods.contains(name + "___" + desc))
			{
				info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
				return name;
			}
			else
			{
				info("renames method '%s.%s%s' to 'localSetLivingAnimations' because it doesn't call its super method", enhancableClassName, name, desc);
				return "localSetLivingAnimations";
			}
		}

		if(isObfuscated)
		{
			if(name.equals("a") && desc.equals("(Lccq;)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method ", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localSetModelAttributes' because it actually is 'setModelAttributes' and doesn't call its super method", enhancableClassName, name, desc);
					return "localSetModelAttributes";
				}
			}
			else if(name.equals("func_178686_a") && desc.equals("(Lnet/minecraft/client/model/ModelBase;)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localSetModelAttributes' because it actually is 'setModelAttributes' and doesn't call its super method", enhancableClassName, name, desc);
					return "localSetModelAttributes";
				}
			}
		}
		else if(name.equals("setModelAttributes") && desc.equals("(Lnet/minecraft/client/model/ModelBase;)V"))
		{
			if(superCallingMethods.contains(name + "___" + desc))
			{
				info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
				return name;
			}
			else
			{
				info("renames method '%s.%s%s' to 'localSetModelAttributes' because it doesn't call its super method", enhancableClassName, name, desc);
				return "localSetModelAttributes";
			}
		}

		if(isObfuscated)
		{
			if(name.equals("a") && desc.equals("(FFFFFFLwv;)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method ", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localSetRotationAngles' because it actually is 'setRotationAngles' and doesn't call its super method", enhancableClassName, name, desc);
					return "localSetRotationAngles";
				}
			}
			else if(name.equals("func_78087_a") && desc.equals("(FFFFFFLnet/minecraft/entity/Entity;)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localSetRotationAngles' because it actually is 'setRotationAngles' and doesn't call its super method", enhancableClassName, name, desc);
					return "localSetRotationAngles";
				}
			}
		}
		else if(name.equals("setRotationAngles") && desc.equals("(FFFFFFLnet/minecraft/entity/Entity;)V"))
		{
			if(superCallingMethods.contains(name + "___" + desc))
			{
				info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
				return name;
			}
			else
			{
				info("renames method '%s.%s%s' to 'localSetRotationAngles' because it doesn't call its super method", enhancableClassName, name, desc);
				return "localSetRotationAngles";
			}
		}

		if(isObfuscated)
		{
			if(name.equals("a") && desc.equals("(Ljava/lang/String;II)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method ", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localSetTextureOffset' because it actually is 'setTextureOffset' and doesn't call its super method", enhancableClassName, name, desc);
					return "localSetTextureOffset";
				}
			}
			else if(name.equals("func_78085_a") && desc.equals("(Ljava/lang/String;II)V"))
			{
				if(superCallingMethods.contains(name + "___" + desc))
				{
					info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
					return name;
				}
				else
				{
					info("renames method '%s.%s%s' to 'localSetTextureOffset' because it actually is 'setTextureOffset' and doesn't call its super method", enhancableClassName, name, desc);
					return "localSetTextureOffset";
				}
			}
		}
		else if(name.equals("setTextureOffset") && desc.equals("(Ljava/lang/String;II)V"))
		{
			if(superCallingMethods.contains(name + "___" + desc))
			{
				info("leaves method '%s.%s%s' untouched because it calls its super method", enhancableClassName, name, desc);
				return name;
			}
			else
			{
				info("renames method '%s.%s%s' to 'localSetTextureOffset' because it doesn't call its super method", enhancableClassName, name, desc);
				return "localSetTextureOffset";
			}
		}

		return name;
	}

	public static void info(String format, Object... args)
	{
		log(Level.INFO, "Render Player API enhancer " + format, args);
	}

	public static void log(Level level, String format, Object... args)
	{
		LogManager.getLogger("RenderPlayerAPIEnhancer").log(level, String.format(format, args));
	}
}
